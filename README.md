# SmartCafe – NTI/ANV

Semestrální projekt pro předmět **Architektonické a návrhové vzory (NTI/ANV)**. Projekt demonstruje návrhové vzory Singleton, Factory a Builder na jednoduchém příkladu kavárny.

## Použité technologie

- **Jazyk:** Java
- **Testy:** JUnit 4.13.1
- **IDE:** IntelliJ IDEA
- **Build nástroj:** projekt neobsahuje Maven ani Gradle; zdrojové a testovací složky a závislost JUnit jsou nastavené v modulu IntelliJ IDEA.

## Implementované návrhové vzory

### Singleton – `CafeConfig`

`CafeConfig` poskytuje jedinou sdílenou instanci konfigurace a název kavárny `Smart Café`. Vzor demonstruje `Main` a ověřuje `CafeConfigTest`.

### Factory – `DrinkFactory`

`DrinkFactory.createDrink(...)` vytváří čaj nebo kávu podle názvu nápoje. Nepodporovaný typ nápoje vyvolá `IllegalArgumentException`. Vzor používá `Main` a ověřuje `DrinkFactoryTest`.

### Builder – `CustomDrink`

`CustomDrink.Builder` sestavuje vlastní nápoj z podporovaného základu (`tea` nebo `coffee`) a volitelných přísad `milk()`, `sugar()` a `caramel()`. Nepodporovaný základ skončí při vytvoření textového popisu nápoje výjimkou z `DrinkFactory`. Nepodporované přísady, například `pancake()`, nejsou metodami builderu, a proto je nelze použít v Java kódu. Vzor demonstruje `Main` a ověřuje `CustomDrinkTest`.

## Struktura projektu

```text
ANV/
├── README.md
└── SmartCafe/
    ├── SmartCafe.iml
    ├── src/
    │   ├── CafeConfig.java
    │   ├── Coffee.java
    │   ├── CustomDrink.java
    │   ├── Drink.java
    │   ├── DrinkFactory.java
    │   ├── Main.java
    │   └── Tea.java
    └── test/
        ├── CafeConfigTest.java
        ├── CustomDrinkTest.java
        └── DrinkFactoryTest.java
```

## Požadavky a spuštění

- JDK nastavené v IntelliJ IDEA.
- IntelliJ IDEA s otevřeným modulem `SmartCafe/`; složka `src` musí být označena jako zdrojová a `test` jako testovací.
- JUnit 4.13.1 a Hamcrest 1.3 dostupné v testovací classpath modulu (v projektu jsou nastavené jako knihovna IntelliJ IDEA).

Spusťte aplikaci spuštěním metody `main` ve třídě `SmartCafe/src/Main.java`. Testy lze spustit jednotlivě nebo jako sadu z adresáře `SmartCafe/test`.

## Autor

- **Jméno:** Jan Skrbek
- **Obor / ročník:** Informační technologie – IS, 2026/27
