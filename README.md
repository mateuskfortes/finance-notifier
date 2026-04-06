# finance-notifier

Projeto base com Spring Boot usando Kotlin e Gradle Kotlin DSL, contendo:

- Site simples com Thymeleaf em `/`
- API REST simples em `/api/hello`

## Requisitos

- Java 21
- Gradle (se ainda nao tiver o wrapper no projeto)

## Estrutura

- `src/main/kotlin/com/financenotifier/FinanceNotifierApplication.kt`
- `src/main/kotlin/com/financenotifier/web/HomeController.kt`
- `src/main/kotlin/com/financenotifier/api/HelloApiController.kt`
- `src/main/resources/templates/index.html`
- `src/main/resources/application.properties`

## Como executar

Se voce tiver Gradle instalado:

```bash
gradle bootRun
```

Depois acesse:

- Web: `http://localhost:8080/`
- API: `http://localhost:8080/api/hello`

## Proximo passo opcional

Para gerar o Gradle Wrapper no projeto:

```bash
gradle wrapper
```
