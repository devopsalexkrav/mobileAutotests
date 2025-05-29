# 📱 Mobile Automation Testing Framework

## 📌 Overview
This project is a mobile automation testing framework for Android application using **Java**, **TestNG**, and **Selenide-Appium**.

## ⚙️ Tech Stack

- **Java 21**
- **TestNG** – test orchestration
- **Selenide-Appium** – automation of mobile apps
- **Maven** – build and dependency management
- **Allure** – reporting
- **Owner** – properties reader

## 📌 Обязательные System properties при запуске тестов
-Denv=local

-Dplatform=android

## 📌 В файле local.properties требуется добавить login и password, так же требуется в android.properties прописать актуальный app

### ▶️ Запуск всех тестов

```bash
   mvn clean test -Denv=local -Dplatform=android
```

### ▶️ Создание allure отчетов 

```bash
   allure generate {FieldPath of allure-results}
   allure open {FieldPath of allure-report}
```