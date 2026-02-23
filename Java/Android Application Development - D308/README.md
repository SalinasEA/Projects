# Mobile Vacation Planner

## **Purpose**

The **Mobile Vacation Planner** is a native Android application designed to help users organize travel itineraries by managing vacations and associated excursions. The application provides a "local-first" experience, allowing users to track trip details, enforce scheduling logic, and set system-level notifications for important travel dates.

### **Operating Directions**

To explore the full functionality and meet all rubric requirements, follow these steps:

#### **1. Managing Vacations (CRUD)**

* **Create**: From the empty Home Screen, press **Add Vacation**. Enter the title and hotel, then use the date buttons to select your travel window.

* **Save**: Access the hamburger menu in the Vacation Details page and select **Save Vacation**.

* **Update/Read**: Selecting a saved vacation from the Home Screen list allows you to modify any details.

* **Delete**: You can delete a vacation via the hamburger menu, provided it has no associated excursions.

#### **2. Managing Excursions (Validation & Logic)**

* **Add Excursion**: Within a specific Vacation Details screen, select **Add Excursion**.

* **Scheduling Logic**: Enter a title and select a date. The application forces the excursion date to fall between the start and end dates of the parent vacation.

* **Excursion Actions**: Use the drop-down menu on individual excursions to update or delete them.

#### **3. Advanced Features (Notifications & Sharing)**

* **Set Notifications**: In the hamburger menu (for vacations) or the drop-down menu (for excursions), select **Set Notification**. Choose a specific time via the time picker to receive a system alert.

* **Share Details**: Use the **Share** option in the vacation hamburger menu to send trip details (title, hotel, dates) to other apps via Android Intents.

#### **4. Data Integrity & Validation**

* **Delete Validation**: To test the required validation logic, try deleting a vacation that still has an excursion associated with it. The app will prevent the deletion to ensure data integrity.

---

### **Technical Deployment**

* **Target Android Version**: The signed APK is deployed and optimized for **Android 16 (API Level 36)** to ensure compatibility with modern system features like the SplashScreen API and updated Notification permissions.

* **Minimum Compatibility**: Supports **Android 8.0 (API Level 26)** and above to ensure 90%+ device coverage while maintaining access to modern notification services.

### **Git Repository**

* **Repository Link**: [https://gitlab.com/wgu-gitlab-environment/student-repos/esali45/d308-mobile-application-development-android](https://gitlab.com/wgu-gitlab-environment/student-repos/esali45/d308-mobile-application-development-android)
