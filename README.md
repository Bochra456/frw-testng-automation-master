# Automation Todos

Projet de tests automatisés pour une application de gestion de tâches (Todo List), basé sur **Selenium WebDriver** et **TestNG**, suivant le pattern **Page Object**.

## 🧰 Stack technique

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven** (gestion des dépendances)
- Pattern **Page Object Model (POM)**

## 📁 Structure du projet

```
com.todos.pages
 └── TodosPage.java          → Page Object de la todo list (locators + actions)

com.todos.tests
 ├── AddTodosTest.java        → Tests d'ajout de tâches
 └── RemoveTodosTest.java     → Tests de suppression de tâches

com.todos.utils
 └── BasePage.java / Setup.java → Configuration commune (driver, fichier de propriétés)
```

## ✅ Fonctionnalités testées

### Ajout de tâche (`AddTodosTest`)

- Vérifie que le champ de saisie de tâche est bien affiché
- Ajoute une nouvelle tâche à partir d'une valeur définie dans le fichier de configuration
- Vérifie que la tâche ajoutée apparaît bien dans la liste
- Vérifie que la case à cocher de la nouvelle tâche n'est **pas** cochée par défaut

### Suppression de tâche (`RemoveTodosTest`)

- Ajoute une tâche à partir d'une valeur définie dans le fichier de configuration
- Vérifie que la tâche ajoutée apparaît bien dans la liste
- Supprime la tâche via le bouton de suppression
- Vérifie que la liste de tâches est bien vide après suppression

## ⚙️ Prérequis

- Java JDK installé
- Maven installé
- Navigateur Chrome + ChromeDriver compatible
- Un fichier `.properties` configuré avec les données de test (ex. `todos1`)

## ▶️ Exécution des tests

### Depuis Eclipse
Clic droit sur la classe de test → **Run As** → **TestNG Test**

### Via un fichier `testng.xml`
```bash
mvn test -DsuiteXmlFile=testng.xml
```

### Via Maven, pour une classe précise
```bash
mvn test -Dtest=AddTodosTest
```

## 📌 À faire

- [ ] Ajouter la couverture pour l'édition d'une tâche existante
- [ ] Ajouter la gestion des tâches multiples (marquer comme terminées, filtrer)
- [ ] Garantir l'ordre d'exécution entre `AddTodosTest` et `RemoveTodosTest` via `testng.xml` si nécessaire
