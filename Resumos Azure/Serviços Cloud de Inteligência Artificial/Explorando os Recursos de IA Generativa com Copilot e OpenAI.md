# 🎓 Desafio: Explorando IA Generativa com Copilot e OpenAI

---

## 📖 Descrição  
Este repositório reúne minhas anotações e evidências do lab sobre IA generativa no Azure AI Foundry e no AI Studio.  
Aqui aplico conceitos de prompts, de filtros de conteúdo e boas práticas de **IA generativa responsável**.

---

## 🎯 Objetivos de Aprendizagem  
- 🔍 Explorar e testar modelos (Gemini) no portal Azure AI Foundry  
- 🤝 Planejar uma solução de IA generativa responsável (Identificar ▸ Medir ▸ Mitigar ▸ Operar)

---


## 🚀 Laboratórios

### 1️⃣ Lab “Explore generative AI in Azure AI Foundry Portal”  
**Link**: https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/12-generative-ai.html  
- **Setup**: criar Resource Group + Azure AI Foundry → “Playgrounds → Chat
- **Testes de prompting**:  
  - Definir claramente papel do sistema (system message)  
  - Iterar: prompt → análise → refinamento  
  - Incluir referências externas (ex.: Wikipedia)  
- **💡 Dica**: mantenha uma cópia dos prompts e das respostas para comparar melhorias!  

---

### 2️⃣ Lab “Prepare for an AI development project”  
**Link**: https://microsoftlearning.github.io/mslearn-ai-studio/Instructions/01-Explore-ai-studio.html  
- **Objetivo**: conhecer o AI Studio, criar projeto e visualizar no Portal Azure  
- **Passos**:  
  1. Criar novo projeto → escolher modelo 
  2. Explorer: Overview, Management Center, métricas de uso  
  3. Testar no Playground usando um **system message** customizado  
- **⚠️ Atenção**: sempre faça **clean up** apagando o Resource Group!  

---

### 3️⃣ Lab “Apply content filters to prevent harmful output”  
**Link**: https://microsoftlearning.github.io/mslearn-ai-studio/Instructions/06-Explore-content-filters.html  
- **Objetivo**: entender filtros padrão e criar filtros customizados  
- **Testes**:  
  - Prompt “seguro” vs. “malicioso”  
  - Desativar filtro padrão → comparar diferenças  
  - Criar regra custom (ex.: bloquear instruções de crime)  
- **💡 Insight**: testar vários níveis de severidade do filtro antes de ir à produção!  

---

## ⚖️ Planejamento de IA Generativa Responsável  
Baseado na metodologia Microsoft:

| Fase        | O que é?                                                                                   |
|-------------|--------------------------------------------------------------------------------------------|
| **Identificar** | 📌 Mapear possíveis danos e riscos relevantes (viés, desinformação, privacidade).      |
| **Medir**       | 📏 Avaliar se esses danos **aparecem** nas saídas do modelo (testes controlados).      |
| **Mitigar**     | 🛡️ Implementar camadas de segurança (filtros, validações, revisão humana).            |
| **Operar**      | 🚦 Definir plano de monitoramento contínuo, logs de uso e protocolos de resposta.      |

---

## 📌 Dicas & Insights Gerais  
- **Versionamento de prompts**: trate cada iteração como “versão” (v0.1, v0.2…)  
- **Registro de custos**: sempre anote horários de criação e exclusão de recursos no Azure  

---

## 🔗 Recursos Úteis  
- Microsoft Copilot Docs: https://aka.ms/copilot-docs  
- Azure OpenAI Service: https://aka.ms/azure-openai  
- Content Filters in AI Studio: https://aka.ms/ai-filters  

Boa jornada no mundo da IA generativa! 🤖✨  
