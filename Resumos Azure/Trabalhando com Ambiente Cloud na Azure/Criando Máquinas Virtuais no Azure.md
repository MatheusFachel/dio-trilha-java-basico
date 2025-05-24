# 🖥️ Desafio: Criando Máquinas Virtuais no Azure

Neste repositório, você encontrará um passo a passo e anotações sobre o processo de criação de máquinas virtuais (VMs) pelo portal do **Microsoft Azure**, bem como conceitos teóricos importantes de **SLA (Service Level Agreement)**.

---

## 📚 Objetivo

- Praticar o processo de criação e configuração de uma VM no Azure.
- Entender os conceitos de disponibilidade (uptime) representados pelos “noves” (99,9%, 99,99%, etc.).
- Documentar de forma clara e organizada as etapas e teorias.
- Compartilhar conhecimento através do GitHub.

---

## 🔧 Passo a Passo: Criar uma VM pelo Portal

1. **Entrar no Portal**  
   Acesse https://portal.azure.com e faça login com sua conta.

2. **Criar um Recurso**  
   - Clique no botão **+ Criar um recurso** (no canto superior esquerdo).  
   - Procure por **“Máquina Virtual”** e selecione **Windows Server 2019 Datacenter** (ou outra imagem de sua escolha).

3. **Configurações Básicas**  
   - **Grupo de Recursos**: selecione um existente ou crie um novo.  
   - **Nome da VM**: escolha um nome único.  
   - **Região**: defina a localização física (ex.: Brasil Sul).  
   - **Tamanho**: clique em **Selecionar tamanho** e escolha a VM adequada ao seu workload.

4. **Segurança e Rede**  
   - **Autenticação**: configure senha ou chave SSH.  
   - **Portas de Entrada**: habilite RDP (porta 3389) para Windows ou SSH (22) para Linux.  
   - Clique em **Avançar** até chegar em **Revisar + criar**.

5. **Revisar e Criar**  
   - Verifique todas as configurações no resumo.  
   - Clique em **Criar** e aguarde a implantação (~2–3 minutos).

6. **Acessar a VM**  
   - No portal, vá em **Máquinas Virtuais** > sua VM > **Conectar** > **RDP** (Windows) ou **SSH** (Linux).  
   - Use as credenciais configuradas para acessar.

---

## 🧠 Teoria: SLA e “Noves” de Disponibilidade

O SLA define a **disponibilidade** garantida pela Microsoft para cada serviço. Quanto maior o número de noves, menor é o tempo máximo de indisponibilidade por ano:

| SLA (%) | “Noves”        | Máx. downtime/ano aproximado |
|---------|----------------|------------------------------|
| 99 %    | 2 noves        | ~3,65 dias                   |
| 99.9 %  | 3 noves        | ~8h 45m                      |
| 99.99 % | 4 noves        | ~52m                         |
| 99.999 %| 5 noves        | ~5m 15s                      |

> 📌 **Dica:** para cenários críticos, combine zonas de disponibilidade e conjuntos de disponibilidade para alcançar SLAs mais altos.

---

## 💡 Dicas de Botões e Funcionalidades no Portal

- **⭐ Favoritos**: marque sua VM ou outros serviços com a estrela para tê-los sempre à mão na barra lateral.
- **🔍 Barra de pesquisa**: digite “Virtual machines” para acessar diretamente a lista de VMs.
- **🔔 Notificações**: acompanhe o status de implantação (ícone de sino no topo).
- **📊 Insights**: na página da VM, clique em **Monitoramento > Métricas** para ver uso de CPU, disco e rede.
- **🔄 Reiniciar/Desligar**: use os botões no topo da página da VM para comandos rápidos.

 
