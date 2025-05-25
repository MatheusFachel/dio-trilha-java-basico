# 🔍 Azure Cognitive Search – Desafio

## 🎯 Objetivos

1. Provisionar recursos no Azure para uma solução de busca inteligente.  
2. Extrair dados de um armazenamento de blobs.  
3. Enriquecer conteúdo usando **skills de IA** (texto, entidades, visão computacional).  
4. Criar e configurar um **índice inteligente** e um **indexador** no portal.  
5. Executar consultas e analisar resultados no **Search Explorer**.  
---

## 📚 Conteúdo Abordado

- **Mineração de Conhecimento**  
  Extração de insights de grandes volumes de dados não estruturados.  

- **Azure Cognitive Search**  
  Plataforma de PaaS que combina motor de pesquisa (Lucene) com capacidades de IA.  

- **Enriquecimento de IA**  
  Uso de Cognitive Services para OCR, detecção de linguagem, extração de entidades, análise de sentimento e mais.  

- **Buscas Cognitivas**  
  Configuração de índices, indexadores e skillsets para transformar conteúdo bruto em dados pesquisáveis e estruturados.  

---

## 🔧 Passo a Passo Detalhado

### 1. Pré-requisitos  
- Conta Azure ativa (pode usar [Free Trial](https://azure.microsoft.com/free))  
- Resource Group dedicado  
- Um **Storage Account** com container de blobs contendo documentos (ex.: JSON de reviews)

### 2. Provisionar Recursos  

1. **Azure Cognitive Search**  
   - Portal → **+ Criar um recurso** → pesquisar **Azure Cognitive Search**  
   - Preencha:  
     - Assinatura & RG  
     - Nome do serviço (único)  
     - Região (mesma do Storage)  
     - Camada: **Basic**  
   - Criar e aguardar deploy.  

2. **Azure AI Services** (Cognitive Services)  
   - Mesmo RG e Região do Search  
   - Camada gratuita ou paga conforme necessidade  

### 3. Configurar o Data Source  

1. No recurso **Azure Cognitive Search** → **Import Data**  
2. Selecione **Azure Blob Storage**  
3. Aponte para seu **Storage Account** e o container com os arquivos (`coffee-reviews/*.json`)  
4. Avance para criar um **data source** nomeado (ex.: `coffee-data-source`)

### 4. Criar Skillset de Enriquecimento  

1. Em **Skillsets** → **+ Add**  
2. Adicione **Cognitive Skills**:  
   - **OCR Skill**: extrair texto de imagens  
   - **Language Detection**: identificar idioma  
   - **Text Analytics – Entity Recognition**  
   - **Text Analytics – Key Phrase Extraction**  
3. Configure a saída de cada skill para campos no documento enriquecido.

### 5. Definir o Índice  

1. Em **Indexes** → **+ Add**  
2. Defina campos:  
   - `id` (key, string)  
   - `content` (searchable, string)  
   - `language` (filterable, string)  
   - `entities` (collection, string)  
   - Outros campos de interesse (data, rating, etc.)  
3. Escolha **Retrievable**, **Searchable**, **Filterable** conforme necessidade.

### 6. Criar o Indexer  

1. Em **Indexers** → **+ Add**  
2. Selecione:  
   - **Data Source**: `coffee-data-source`  
   - **Target Index**: seu índice criado  
   - **Skillset**: o skillset configurado  
3. Programe para execução única ou recorrente.  
4. Salve e execute.  

### 7. Consultar o Índice  

1. Vá em **Search Explorer** no portal do Search  
2. Faça buscas como:  
   - `search=coffee AND quality`  
   - `search=“great service”`  
   - Use filtros: `language eq 'en'`  
3. Explore resultados enriquecidos: entidades, key phrases, texto extraído de imagens.

---

## 🧠 Fundamentos Teóricos

| Tópico                         | Descrição                                                                                                                      |
|--------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| **Knowledge Mining**           | Processo de extrair insights de dados não estruturados (textos, imagens, logs).                                                 |
| **Skillsets & Cognitive Skills** | Pipelines de IA que transformam documentos brutos em metadados ricos (OCR, NLP, Computer Vision).                              |
| **Indexação Inteligente**      | Arquitetura que combina data source → skillset → índice → indexer → query.                                                     |
| **Knowledge Store (Opcional)** | Armazena resultados brutos dos indexadores em tabelas ou arquivos JSON para análises e relatórios personalizados.             |
| **Search Explorer**            | Ferramenta UI para validar e testar consultas, filtros e ordenações sem código.                                                |
| **SLA & Escalabilidade**       | Azure Cognitive Search oferece SLA de 99.9% e pode escalar as unidades de busca para lidar com cargas variáveis.               |

---
