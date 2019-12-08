# Bloccode

This project is aimed at giving people who have never had the chance to interact with programming an introduction into the programming world. 

Unlike languages like Scratch which are aimed mainly at children and early learners, this Bloccode language/IDE will be most useful for those in non-technical fields that have been tasked with learning programming from scratch.
The main appeal of this will be for the fact that the language will not only be teaching, but also helping to generate the code, in several different languages such as Java, Python, and C, so that the learner may be able to see the code that goes into creating something that they built with blocks.
The code generated in the end will be compilable/interpretable by standard compilers and will serve as a reference point that the learners can become used to seeing without having to memorize statements, only learn the functionality of different languages.

## Reason for This Project

Although we are in the information age, a time in history where technology has become an increasingly prevalent part of our daily lives, many people do not understand the core fundamentals of how computer programs are written. This language/IDE will allow those who have never touched programming and have a basic understanding of computers to learn what makes complicated functions work.
This will be a free, open source, easily accessible solution for people, young and old, formally educated and not to learn programming.

## The Infrastructure of the IDE

The IDE will consist of a main Java Class and Form ([Blocks.java](https://github.com/AlexanderMcLaughlin/Bloccode/blob/master/src/buildingblocks/Blocks.java) and [Blocks.form](https://github.com/AlexanderMcLaughlin/Bloccode/blob/master/src/buildingblocks/Blocks.form)) which will serve as the main UI for the IDE. It will consist of different "Blocks" that will represent the different statements in different programming languages such as print, for, and if. There will be a class ([Block.java](https://github.com/AlexanderMcLaughlin/Bloccode/blob/master/src/buildingblocks/Block.java)) which will be a subclass of JPanel which will represent a template used for subclass Blocks representing each of the programming language statements ([PrintBlock.java](https://github.com/AlexanderMcLaughlin/Bloccode/blob/master/src/buildingblocks/PrintBlock.java), ForBlock.java)

The IDE will be a drag and drop which will read the Blocks organized in the GUI from left to right and top to bottom. The IDE afterwards will likely look like a piece of lined paper with Blocks representing lines of code, a right sidebar that has buttons to create different statements, and a bottom bar that will include a "compile / make" button and mild error detection.

This IDE will be written with the help of the NetBeans IDE as well as its builtin AWT GUI builder.
