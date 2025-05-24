# 🚀  Azure AI Fundamentals – Desafio DIO

### 🤖 Visão Geral  
Este repositório reúne meu **Lab DIO** para praticar e aprofundar o uso das ferramentas de IA da Microsoft:  
- **Azure Speech Studio** (Speech-to-Text)  
- **Azure Language Studio** (Text Analytics & QnA)  

Aqui você encontrará anotações de cada vídeo-aula, dicas e insights para cada etapa! (+ algumas pesquisas feitas por mim mesmo)

---

## 🎯 Objetivos de Aprendizagem  
1. **Hands-on** com Speech-to-Text e Text Analytics  
2. Documentar processos de forma **clara**, **visual** e **reprodutível**  

---

## 📝 Passo-a-Passo & Insights  

### 1. Conhecendo o Speech Studio  
- **Configuração**: crie recurso “Speech” no Portal Azure.  
- **Playground**: teste upload de áudio (`.m4a`, `.wav`) e veja a transcrição em tempo real.  
- **Insight**: experimente diferentes `speechModels` (conversational, default) para medir latência vs. precisão.

### 2. Conhecendo o Language Studio  
- **Configuração**: crie recurso “Language” (Form Recognizer / Text Analytics).  
- **Playground**: carregue textos grandes e valide extração de entidades, frases-chave e sentiment.  
- **Insight**: textos mais longos tendem a exigir chunking manual antes de enviar ao endpoint.

### 3. Análise de Texto & QnA  
- **Text Analytics**: extraia **Named Entities**, **Key Phrases** e **Summarization**.  
- **QnA Maker**: crie um banco de perguntas/respostas a partir de FAQs no portal.  
- **Insight**: mantenha suas FAQs simples (5-10 pares) para treinar a resposta com maior precisão.

### 4. Serviço de Bot do Azure  
- **Bot Framework Composer**: configure um bot que consome seu QnA Maker.  
- **Teste local**: use “Bot Framework Emulator” para validar fluxos de conversa.  
- **Insight**: modularize diálogos em tópicos para facilitar manutenção.

### 5. Compreensão da Linguagem Coloquial  
- **Custom Text Classification**: alimente exemplos com gírias regionais.  
- **Teste intensivo**: envie inputs “informais” para ajustar sua **LUIS App** ou **Custom Model**.  
- **Insight**: colete logs reais de chat para enriquecer o dataset de treinamento.

### 6. Links Úteis  
- [Documentação Speech SDK](https://learn.microsoft.com/azure/cognitive-services/speech-service/)
- [Documentação Text Analytics](https://learn.microsoft.com/azure/cognitive-services/language-service/)
- Exemplos oficiais no GitHub: [Azure-Samples/cognitive-services-node-sdk-samples](https://github.com/Azure-Samples)

---

