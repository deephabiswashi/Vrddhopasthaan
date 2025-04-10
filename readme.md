# Vrddhopasthaan

A full-featured JavaFX-based application designed to support and empower senior citizens by providing personalized healthcare assistance, emergency tools, medication reminders, appointment scheduling, voice-based support, and caregiver monitoring — all in one platform.

---

## 🚀 Overview

Vrddhopasthaan aims to offer a modern, accessible, and intuitive interface with support for elderly users through:

- Medicine & appointment reminders
- Emergency SOS alerts
- Health record management
- Caregiver access
- Voice command integration
- Customizable settings & themes

Built with JavaFX and SQLite, Vrddhopasthaan emphasizes simplicity, security, and extensibility.

---

## 📁 Project Structure

```
Vrddhopasthaan/
│
├── src/
│   └── main/
│       ├── java/app/
│       │   ├── Main.java                     # Entry point
│       │   ├── controllers/                  # All controller classes
│       │   │   ├── RegistrationController.java
│       │   │   ├── HomeController.java
│       │   │   ├── AppointmentController.java
│       │   │   ├── MedicationAlertController.java
│       │   │   ├── EmergencySOSController.java
│       │   │   ├── HealthRecordsController.java
│       │   │   ├── VoiceCommandController.java
│       │   │   ├── CaregiverModeController.java
│       │   │   ├── MedicationHistoryController.java
│       │   │   ├── EmergencyContactsController.java
│       │   │   └── SettingsPanelController.java
│       │   ├── database/
│       │   │   └── DatabaseManager.java      # SQLite DB management
│       │   ├── models/
│       │   │   ├── Appointment.java
│       │   │   ├── Patient.java
│       │   │   ├── Doctor.java
│       │   │   └── HealthRecord.java
│       │   └── services/
│       │       ├── RegistrationService.java
│       │       ├── AppointmentService.java
│       │       └── AlertService.java
│       └── resources/
│           ├── views/                        # FXML files
│           ├── styles/                       # CSS styling
│           └── images/                       # UI assets
│
├── test/                                     # Unit tests
├── target/
├── vrddhopasthaan.db                         # SQLite database
├── pom.xml                                   # Maven configuration
└── README.md
```

---

## 🧠 Features

### 👵 User Registration/Login
- Register and log in using a basic credential system.
- Extendable for secure hashed password storage.

### 💊 Medicine Reminders
- Custom medication name + time input.
- Uses `AlertService` for alert scheduling (stubbed for now).

### 🦥 Appointment Scheduler
- Add/view upcoming doctor appointments.
- Stored in the SQLite database via `AppointmentService`.

### 🚘 Emergency SOS
- One-click SOS alert trigger.
- Placeholder for future real-time emergency API integration.

### 📁 Health Record Viewer
- Load static or DB-based health data for elderly users.
- Intended to support doctors or caregivers.

### 🗣 Voice Command Integration
- Stubbed interface ready for Java Speech API or third-party SDKs.
- Example: Start/stop alert using voice.

### 🤝 Caregiver Mode
- A readonly panel to show reminders & health stats to a trusted caregiver.

### 📊 Medication History
- TableView for previous medications and visit logs.
- Potential to evolve into a chart-based dashboard.

### ☎️ Emergency Contacts
- View and (in future) contact saved emergency numbers.
- Placeholder for phone/messaging API integration.

### ⚙️ Settings Panel
- Theme customization (e.g., Dark/Light/Vibrant).
- Future integration for font size, language, accessibility.

---

## 🛠 Installation & Run

### Requirements
- Java JDK 11 or higher
- Maven 3.x
- JavaFX SDK
- SQLite JDBC (included via Maven)

### Running Locally

```bash
# Step 1: Clone the repo
git clone https://github.com/deephabiswashi/Vrddhopasthaan.git
cd Vrddhopasthaan

# Step 2: Build the app
mvn clean install

# Step 3: Run the app
mvn javafx:run
```

> Ensure JavaFX SDK is configured in your environment or IDE (like IntelliJ or Eclipse).

---

## 💻 Technologies Used

- Java 11
- JavaFX 21
- Maven
- SQLite (via JDBC)
- FXML
- CSS for styling
- Scene Builder (for FXML GUI design)

---

## 🔮 Planned Enhancements

- ✅ Real-time notification system
- ✅ RESTful API for caregiver dashboard
- ✅ Voice control with speech recognition
- ✅ Biometric authentication
- ✅ Drag & drop scheduling calendar
- ✅ Interactive map for hospital/clinic locations
- ✅ Localized support (multi-language)

---

## 👥 Authors

| Name              | Role                 |
|------------------|----------------------|
| Avilasha Goswami | UI/UX & Frontend     |
| Deep Habiswashi  | Backend Logic        |
| Kaushiki Sarkar  | Database Management  |
| Soumyadeep Dutta | Integrations & Voice |

---

## 📄 License

This project is currently under development and shared for academic and demo purposes. Licensing details to be added soon.

---

## 📬 Contact

For queries or collaboration:

📧 deephabiswashi@gmail.com  
🌐 Project page: https://github.com/deephabiswashi/Vrddhopasthaan

---

Vrddhopasthaan — Serving those who’ve served us ❤️