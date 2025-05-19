# 🔐 API REST com JWT - Segurança Implementada

Este projeto é uma API REST construída com Spring Boot, que implementa **autenticação baseada em JWT (JSON Web Token)** para proteger os endpoints. A base do projeto segue o desafio proposto originalmente, mas aqui foi **expandida e protegida com segurança de autenticação moderna**, utilizando Spring Security e JWT.

## ✅ O que foi implementado além do código original:

- 🔐 **Camada de segurança com Spring Security**
- 🛡️ **JWT para autenticação de usuários**
- 👤 **Filtro de autenticação JWT personalizado (`JwtAuthenticationFilter`)**
- 🧪 Banco de dados em memória (H2) para ambiente de desenvolvimento
- 🔄 Possibilidade de alternar perfis entre `dev` (local) e `prd` (produção)

---

## 📁 Perfis de aplicação

O projeto está configurado para usar dois perfis de ambiente:

### 🧪 `application-dev.yml`:
- Usa banco de dados H2 (em memória)
- Exibe o console H2 para depuração
- Usa um segredo de JWT fixo (não seguro para produção)
- Ideal para testes locais e desenvolvimento

### 🚀 `application-prd.yml`:
- Usa banco de dados PostgreSQL
- Espera variáveis de ambiente com dados sensíveis:
  - `PGHOST`, `PGPORT`, `PGDATABASE`, `PGUSER`, `PGPASSWORD`
  - `JWT_SECRET`, `JWT_EXPIRATION_MS`

---

## ⚙️ Como rodar o projeto

### 1. Ativar o perfil desejado

#### ✅ Para **dev**:
Crie um arquivo `application.yml` (na pasta `src/main/resources`) com o seguinte conteúdo:

```yaml
spring:
  profiles:
    active: dev
