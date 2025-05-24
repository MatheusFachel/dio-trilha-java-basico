# 🗄️ Desafio: Configurando uma Instância de Banco de Dados no Azure SQL Managed Instance

Este README traz passo a passo, anotações e dicas para criar e configurar uma instância gerenciada de SQL no **Microsoft Azure**, alinhado ao quickstart oficial.

---

## 🎯 Objetivos

- Praticar a criação e configuração de uma instância de banco de dados no portal Azure.  
- Entender conceitos teóricos de arquitetura e melhores práticas de custo e segurança.  
- Documentar processos de forma clara para servir de referência futura.  

---

## 🔗 Documentação Oficial

Quickstart no portal Azure:  
https://learn.microsoft.com/pt-br/azure/azure-sql/managed-instance/instance-create-quickstart?view=azuresql&tabs=azure-portal

---

## 🚀 Passo a Passo (Portal Azure)

1. **Acesse o Portal**  
   - https://portal.azure.com ➡️ faça login.

2. **Criar Recurso SQL Managed Instance**  
   - Clique em **+ Criar um recurso** → **Azure SQL** → **Managed Instance**.

3. **Configurações Básicas**  
   - **Assinatura & Grupo de Recursos**: escolha ou crie um novo.  
   - **Nome da Instância**: único e descritivo.  
   - **Região**: selecione a mais próxima de você/público para reduzir latência.

4. **Configurações de Computação**  
   - **Tamanho da VM**:  
     - Para testes/dev: prefira séries B (B1s, B2s) para economizar.  
     - Produção: avalie série D/E conforme CPU e memória.  
   - **Disco**:  
     - Comece com **Managed HDD** para economizar; migre para **SSD Premium** se precisar de I/O intenso.

5. **Segurança e Rede**  
   - **Rede Virtual (VNet)**: crie ou confirme VNet/Sub-rede compatível.  
   - **IP Público**: só habilite se realmente for acessar externamente.  
   - **NSG (Network Security Group)**: regras mínimas — RDP/SSH apenas do seu IP.  

6. **Configurações Avançadas**  
   - **Auto Shutdown**: programe para desligar a instância fora do horário de uso e economizar custos.  
   - **Tags**: adicione metadados, ex.:  
     ```
     Projeto=MeuDBTestes  
     Ambiente=Dev  
     Responsável=Nicolas  
     ```  

7. **Revisar + Criar**  
   - Verifique todas as opções e clique em **Criar**.  
   - Acompanhe status pelo **ícone de sino** (Notificações).

---

## 🧠 Conceitos Teóricos

- **Alta Disponibilidade (HA)**  
  As Managed Instances oferecem redundância embutida no SLA, mas você pode elevar a disponibilidade integrando zonas ou geo-replicação.

- **Custo vs. Performance**  
  - **Séries B**: burstable para cargas leves.  
  - **Séries D/E**: alto desempenho, indicado para produção.

- **Governança**  
  - **Grupos de Recursos**: agrupe tudo de um projeto; facilita cleanup.  
  - **Tags**: mantenha rastreabilidade e relatórios de custo.

---

