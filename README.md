# SmartCafe – NTI/ANV

Semestrální projekt v rámci předmětu **Architektonické a návrhové vzory (NTI/ANV)**. Jedná se o celistvý systém pro správu kavárny, na kterém jsou v průběhu cvičení postupně aplikovány a demonstrovány různé návrhové vzory.

---

## 🚀 Použité technologie

* **Jazyk:** Java
* **Testovací rámec:** JUnit 5
* **Sestavovací prostředí / IDE:** IntelliJ IDEA

---

## 🛠️ Implementované návrhové vzory

### 1. Singleton (Jedináček)
* **Třída:** `CafeConfig`
* **Popis:** Zajišťuje existenci právě jedné instance globální konfigurace kavárny v rámci celé aplikace a poskytuje k ní jednotný přístupový bod.
* **Využití:** Načtení a předávání globálního nastavení kavárny (např. název, otevírací doba, kapacita).
* **Ukázka:** Metoda je demonstrativně volána v `Main.java`.
* **Testy:** Funkcionalita je pokryta jednotkovými testy v `CafeConfigTest.java`.

---

## 📂 Struktura projektu

```text
SmartCafe/
├── src/
│   ├── CafeConfig.java      # Třída uchovávající konfiguraci (Singleton)
│   └── Main.java            # Hlavní třída pro demonstraci funkcionality
├── test/
│   └── CafeConfigTest.java  # Jednotkové testy třídy CafeConfig
├── SmartCafe.iml
└── README.md
```

---

## 🧪 Jak spustit aplikaci a testy

### Požadavky
* Java Development Kit (JDK) 17 nebo novější.
* Přidaná závislost na **JUnit 5** v classpath (případně spravováno přes vývojové prostředí).

### Spuštění aplikace
1. Otevřete projekt ve svém IDE (např. IntelliJ IDEA).
2. Spusťte třídu `src/Main.java` (metoda `main`).

### Spuštění testů
1. Ujistěte se, že složka `test` je v IDE označena jako **Test Sources Root**.
2. Spusťte testovací třídu `test/CafeConfigTest.java` (např. pomocí klávesové zkratky `Ctrl + Shift + F10` / `Cmd + Shift + R`).

---

## 👤 Autor
* **Jméno:** Jan Skrbek
* **Obor / Ročník:** Informační technologie – IS, 2026/27
