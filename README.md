# 🚀 Automate Chrome Tabs

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" />
  <img src="https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge" />
</p>

This project helps you **automatically open a set of your favorite websites** (like Gmail, LeetCode, ChatGPT, W3Schools, etc.) with just one click.  
It’s available in both **Java** and **Python** implementations.

---

## 📌 Features
- Open multiple websites in your **default browser** automatically.
- 1-second delay between opening tabs (prevents browser overload).
- Works on **Windows, macOS, and Linux**.
- Easy to customize → just edit the URL list.

---

## 🛠️ Requirements
- **Java (JDK 8+)** or **Python 3.x** installed.  
- A modern web browser (Chrome, Firefox, Edge, Safari, etc.).

---

## ▶️ Usage

### **1. Clone the repo**
git clone https://github.com/harsh11ith/Automate_ChromeTabs.git
cd Automate_ChromeTabs

### **2. Run with Java**
javac OpenTabs.java
java OpenTabs

### **3. Run with Python**
python OpenTabs.py

## ⚡ Customization

To add or remove websites, open OpenTabs.java or OpenTabs.py and edit the urls list:

### Java

String[] urls = {
    "https://mail.google.com",
    "https://leetcode.com",
    "https://chatgpt.com",
    "https://www.w3schools.com"
};

### Python
urls = [
    "https://mail.google.com",
    "https://leetcode.com",
    "https://chatgpt.com",
    "https://www.w3schools.com"
]

### 📂 Project Structure
Automate_ChromeTabs/
│── OpenTabs.java   # Java implementation
│── OpenTabs.py     # Python implementation
│── README.md       # Project documentation

### 🙌 Contributing

Pull requests are welcome!
If you have suggestions to make this tool better (like config files, scheduling, etc.), feel free to fork and submit improvements

### 📜 License

This project is open-source under the MIT License.

---



