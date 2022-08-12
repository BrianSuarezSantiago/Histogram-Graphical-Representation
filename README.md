<a href="https://www.java.com/">
    <img align="right" src="https://custom-icon-badges.herokuapp.com/badge/Java-E8E8E8.svg?logo=Java" alt="Java">
</a>

<h1 align="center">📊 Histogram Graphical Representation 📈</h1>


<p align="center">
    <img src="./assets/Execution of Histogram.gif" alt="Histogram Graphical Representation Execution">
    <sub>· Execution of Histogram Graphical Representation ·</sub>
</p>


## 📚 Fundamentals

The software available in this repository allows the graphical display of a histogram showing the frequency of use of the principal e-mail domains most used in the world.


## 👨🏻‍💻 Implementation

The development of this practice consists of the creation of a histogram where the percentage of existing users for a given e-mail provider is represented using a bar chart diagram. The software consists of two versions where the Java libraries *JFreeChart* and *JCommon* are used for the graphical representation of the histogram.

### 1️⃣ <ins>First version:</ins>

The first version of this software introduces the creation of the main window of the application and its design elements, such as the title, name of the axes, and dimensions, as well as the creation of the corresponding bar chart which will be arranged in that frame. Similarly, we proceed to the creation of the dataset that will be used as a basis to create the histogram.

<img src="./diagrams/Kata 3. Version 1.png" alt="Kata 3. Version 1 Class Diagram" width="500px" height="300px">

### 2️⃣ <ins>Second Version:</ins>

The second version of this software takes advantage of the implementation developed in the first version and introduces the class called Histogram, which provides the necessary public methods for the creation of a histogram as well as for obtaining information related to it.

<img src="./diagrams/Kata 3. Version 2.png" alt="Kata 3. Version 2 Class Diagram" width="600px" height="500px">


## 💾 Expected Outputs

The results of running each of the implemented versions can be found [here.](./docs/)


## 🚀 Build the project

1. Clone the repository using git with `git clone https://github.com/BrianSuarezSantiago/Histogram-Graphical-Representation.git` command or download from [Source Code.](https://github.com/BrianSuarezSantiago/Histogram-Graphical-Representation/archive/refs/heads/master.zip)

2. Move to the directory where you have the code.

3. Compile using `javac -d . *.java` command followed by the `java histogram.Main` command to run and use the available software.

<hr>
<p align="center">
Made with ♥️ in Spain
</p>
