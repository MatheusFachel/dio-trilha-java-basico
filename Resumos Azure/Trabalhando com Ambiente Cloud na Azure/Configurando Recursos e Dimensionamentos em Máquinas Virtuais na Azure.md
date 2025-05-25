# 💻 Desafio: Configurando Recursos e Dimensionamentos em Máquinas Virtuais na Azure

Este repositório reúne minhas anotações e práticas sobre configuração avançada de VMs no **Microsoft Azure**, com foco em:

- 📈 **Escalabilidade Horizontal**  
- 👻 **Discos “Fantasma”**  
- 🤝 **Pools de VMs & Balanceamento**  
- 🎓 **Preparação para AZ-900**

---

## 🎯 Objetivos

1. 👷‍♂️ Criar VMs e configurar **Scale Sets** para auto-escalonamento.  
2. 🧹 Entender e prevenir custos ocultos com discos não removidos.  
3. ⚖️ Implementar **Load Balancer + VM Pools** para alta disponibilidade.  

---

## 🔧 Passo a Passo Detalhado

### 1. Criar a VM Base

1. Acesse o **Portal Azure** (https://portal.azure.com).  
2. Clique em **+ Criar um recurso → Computação → Máquina Virtual**.  
3. Preencha:  
   - **Grupo de Recursos**: novo ou existente.  
   - **Nome**: ex.: `vm-avancada-01`.  
   - **Região**: escolha próxima a você/público.  
   - **Tamanho**: para testes, séries B1s/B2s; produção, D/E conforme carga.  

### 2. Configurar Escalabilidade Horizontal

- **VM Scale Set**  
  1. No portal: **+ Criar recurso → Compute → Scale set de VMs**.  
  2. Vincule ao mesmo RG e VNet da VM base.  
  3. Defina **instâncias iniciais** (p.ex. 2).  
  4. Em **Configurações de Auto-Scale**, crie regras:  
     - CPU > 70% por 5 min → +1 instância  
     - CPU < 30% por 10 min → –1 instância  
  5. Salve e aguarde deploy automático das VMs.

### 3. Prevenir “Discos Fantasmas”

Quando você **deleta uma VM**, o Azure NÃO remove automaticamente:

- Discos Gerenciados  
- NICs (Interfaces de Rede)  
- IPs Públicos  
- Discos de Armazenamento Temporário (ephemeral)

🔎 **Como limpar**:  
1. Vá em **Grupos de Recursos** → selecione o RG da VM.  
2. Marque todos os **Discos**, **Interfaces** e **IP Públicos** não utilizados.  
3. Clique em **Excluir**.

> 💡 **Dica CLI**:  
> ```bash
> az resource delete --ids $(az disk list --query "[?managedBy==''].id" -o tsv)
> ```

### 4. Implementar Pools de VMs + Load Balancer

1. **Criar um Load Balancer** (LB Standard) no mesmo RG/VNet.  
2. **Backend Pool**: associe seu Scale Set ao pool de back-end do LB.  
3. **Health Probe**: configure porta TCP/HTTP para checar saúde das VMs.  
4. **Rules**: direcione tráfego da porta 80/443 para o pool.  

Resultado: distribuição automática de carga e tolerância a falhas. ✅

---

## 🧠 Fundamentos Teóricos

| Tópico                     | Descrição                                                                                                                                      |
|----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|
| **Escalabilidade**         | <ul><li>*Scale-Up*: aumentar recursos de uma instância.</li><li>*Scale-Out*: adicionar mais instâncias (recomendado para web apps).</li></ul>     |
| **VM Scale Sets**          | Conjunto de VMs idênticas gerenciado como um todo, com auto-scale e integração nativa a Load Balancers.                                        |
| **Discos Gerenciados**     | Armazenamento persistente desacoplado da VM — não removido na exclusão, gerando custos se esquecido.                                            |
| **Pools de VMs**           | Conjunto de instâncias atrás de um Load Balancer, fornece alta disponibilidade e distribuição de tráfego.                                       |
| **Azure Load Balancer**    | Serviço L4 (camada de transporte) que distribui conexões de entrada entre instâncias ativas.                                                   |
| **Auto Shutdown**          | Desligamento programado de VMs para economizar; configurável em “Propriedades” de cada VM.                                                     |
| **Tags & RGs**             | Organização e governança; RG agrupa recursos, tags facilitam filtragem e relatórios de custo.                                                  |
| **Certificação AZ-900**    | Fundamentos de Cloud: Modelos IaaS/PaaS/SaaS, SLAs (“noves”), tipos de serviços (Compute, Storage, Networking, DB), segurança e governança.     |

---

## 🎓 Dicas Extras para AZ-900

- 🔍 **IaaS vs PaaS vs SaaS**: exemplos práticos (VMs, App Service, Office 365).  
- ⭐ **Níveis de SLA**: 99 %, 99.9 %, 99.99 % — entenda trade-offs de custo vs downtime.  
- 🔐 **Segurança**: Azure Policy, RBAC, NSGs e Azure Firewall.  
- 🌐 **Networking**: VNet, Sub-nets, Peering e VPN Gateway.  
- 📊 **Monitoramento**: Azure Monitor, Application Insights e Log Analytics.

---

