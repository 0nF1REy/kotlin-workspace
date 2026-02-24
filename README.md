<p align="center">
    <img src="./resources/docs/logotypes/kotlin-workspace.png" width="280" alt="Logotipo — Kotlin Workspace" />
</p>

<div align="center">

![Maintenance](https://img.shields.io/maintenance/yes/2026?style=for-the-badge)
![License MIT](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)

</div>

## Kotlin Workspace

## 📖 Descrição

Uma pequena coleção de aplicações de exemplo em Kotlin e projetos de amostra para Android.

## 🧞 Visão geral do repositório

Este repositório contém múltiplos projetos em Kotlin agrupados em duas áreas principais:

- Exemplos de CLI: exemplos leves em Kotlin para linha de comando.
- Aplicativos GUI (Android): pequenos aplicativos Android organizados como subprojetos separados (por exemplo, BlessedPhrases, Magic8Ball, Pokedex).

Cada subprojeto Android é autocontido e inclui seu próprio Gradle wrapper e configuração em `gui/src/<ProjectName>/`.

## 📁 Estrutura do repositório (visão geral)

- `cli/` — exemplos simples em Kotlin para linha de comando (demos de um único arquivo).
- `gui/src/` — aplicativos de exemplo para Android. Cada app está em sua própria pasta e inclui um módulo `app/` e o Gradle wrapper.

## 🚀 Projetos

### 🔎 Pokedex

**📂 Pasta:** `Pokedex/`  
**🎯 Descrição:** Um aplicativo Pokedex construído com práticas modernas de desenvolvimento Android. Ele demonstra uma arquitetura limpa e componentização de UI com Jetpack Compose. O projeto opera primariamente offline, com todos os dados sendo lidos de um dataset JSON local, enquanto as imagens são carregadas de uma fonte remota para otimizar o tamanho do aplicativo. É uma referência didática clara e fácil de estender.

#### 📱 Telas

<div align="center">
<table align="center" style="border-collapse:collapse;">
  <tr>
    <td style="padding:8px; text-align:center; vertical-align:top;">
      <p style="margin:0 0 8px 0; font-weight:700;">Splash</p>
      <img src="./resources/docs/project-highlights/pokedex/01-splash.jpeg" alt="Pokedex splash" height="300" style="display:block; margin:0 auto;" />
    </td>
    <td style="padding:8px; text-align:center; vertical-align:top;">
      <p style="margin:0 0 8px 0; font-weight:700;">Home</p>
      <img src="./resources/docs/project-highlights/pokedex/02-home.jpeg" alt="Pokedex home" height="300" style="display:block; margin:0 auto;" />
    </td>
  </tr>
</table>
</div>

#### ✨ Principais Funcionalidades

- **Navegação de Pokémon:** Visualize uma lista de Pokémon e navegue entre eles com botões de "Anterior" e "Próximo".
- **Visualização de Tipos:** Cards coloridos que exibem os tipos de cada Pokémon.
- **Análise de Batalha:** Informações claras sobre contra quais tipos o Pokémon é forte e fraco.
- **Linha Evolutiva:** Exibição da cadeia de evoluções do Pokémon.
- **UI Responsiva:** O layout se adapta para funcionar nos modos retrato e paisagem.

#### 🧰 Stack de Tecnologia e Arquitetura

- **Linguagem:** Kotlin.
- **UI Toolkit:** **Jetpack Compose** para uma UI declarativa e moderna.
- **Arquitetura:** **MVVM** (Model-View-ViewModel) para uma clara separação de responsabilidades.
- **Gerenciamento de Estado:** **StateFlow** do Kotlin Coroutines para um fluxo de dados reativo e observável.
- **Carregamento de Imagens:** **Coil** para carregar imagens da internet de forma eficiente.
- **API de Splash Screen:** Implementação da API oficial do Android para uma tela de inicialização moderna e consistente.
- **Build System:** **Gradle** com Kotlin DSL.

---

## 🔧 Pré-requisitos

- JDK 11 ou superior (dependendo dos requisitos do Android Gradle Plugin usados nos projetos).
- Compilador de linha de comando do Kotlin (`kotlinc`) caso queira compilar os exemplos CLI sem usar o Gradle.
- Android Studio (recomendado) ou Android SDK + Gradle para construir os projetos Android.

## ⚙️ Build e execução

Exemplo CLI (Hello World)

Você pode compilar e executar o exemplo simples de CLI em Kotlin diretamente com o compilador Kotlin:

```bash
# a partir da raiz do repositório

# Compilar
kotlinc cli/src/01_hello_world/HelloWorld.kt -d out

# Executar (o nome da classe vira HelloWorldKt para um main em top-level)
kotlin -cp out HelloWorldKt
```

---

**Apps Android** (BlessedPhrases, Magic8Ball, Pokedex)

Cada subprojeto Android contém seu próprio Gradle wrapper. Para construir um app específico, entre na pasta do projeto e use o wrapper. Por exemplo, para montar um APK debug do Pokedex:

```bash
# Entre no diretório do projeto Pokedex
cd gui/src/Pokedex

# Build do APK em modo debug
./gradlew assembleDebug

# Para instalar em um dispositivo conectado:
./gradlew installDebug
```

Como alternativa, abra o projeto no Android Studio (preferível para desenvolvimento) e importe o projeto Gradle — o Android Studio cuidará da configuração do SDK/Gradle para você.

## 👤 Sobre o Desenvolvedor <a name="sobre-o-desenvolvedor"></a>

<table align="center">
  <tr>
    <td align="center">
        <br>
        <a href="https://github.com/0nF1REy" target="_blank">
          <img src="./resources/docs/developer/alan-ryan.jpg" height="160" alt="Foto — Alan Ryan">
        </a>
        </p>
        <a href="https://github.com/0nF1REy" target="_blank">
          <strong>Alan Ryan</strong>
        </a>
        </p>
        ☕ Peopleware | Tech Enthusiast | Code Slinger ☕
        <br>
        Apaixonado por código limpo, arquitetura escalável e experiências digitais envolventes
        </p>
          Conecte-se comigo:
        </p>
        <a href="https://www.linkedin.com/in/alan-ryan-b115ba228" target="_blank">
          <img src="https://img.shields.io/badge/LinkedIn-Alan_Ryan-0077B5?style=flat&logo=linkedin" alt="LinkedIn">
        </a>
        <a href="https://gitlab.com/alanryan619" target="_blank">
          <img src="https://img.shields.io/badge/GitLab-@0nF1REy-FCA121?style=flat&logo=gitlab" alt="GitLab">
        </a>
        <a href="mailto:alanryan619@gmail.com" target="_blank">
          <img src="https://img.shields.io/badge/Email-alanryan619@gmail.com-D14836?style=flat&logo=gmail" alt="Email">
        </a>
        </p>
    </td>
  </tr>
</table>

</div>

---

## 📜 Licença <a name="licenca"></a>

Este projeto está sob a **licença MIT**. Consulte o arquivo **[LICENSE](LICENSE)** para obter mais detalhes.

> ℹ️ **Aviso de Licença:** &copy; 2025-2026 Alan Ryan da Silva Domingues. Este projeto está licenciado sob os termos da licença MIT. Isso significa que você pode usá-lo, copiá-lo, modificá-lo e distribuí-lo com liberdade, desde que mantenha os avisos de copyright.

⭐ Se este repositório foi útil para você, considere dar uma estrela!
