# MiniShell

A simple Java-based shell/terminal emulator that provides basic file system operations.

---

## Overview

MiniShell is a command-line program that mimics a basic shell.  
You can navigate folders, list and create files/directories, and get help right from your console.

---

## Features

- Show current working directory (`pwd`)
- List files and directories (`ls`)
- Change directory (`cd`)
- Create new directories (`mkdir`)
- Create new files (`touch`)
- Display help information (`help`)
- Exit the shell (`exit`)

---

## Commands

| Command          | Description                     | Usage                   |
|------------------|---------------------------------|-------------------------|
| `pwd`            | Print working directory         | `pwd`                   |
| `ls`             | List files in current directory | `ls`                    |
| `cd`             | Change directory                | `cd [directory_name]`   |
| `mkdir`          | Create new directory            | `mkdir [directory_name]`|
| `touch`          | Create new file                 | `touch [file_name]`     |
| `help`           | Show help information           | `help`                  |
| `exit`           | Exit the program                | `exit`                  |

---

## Project Structure

- **src/**
  - `MiniShell.java` — The main class. Reads user input and runs commands.
  - `ShellCommandHandler.java` — Contains all the logic for commands like `pwd`, `ls`, `cd`, `mkdir`, `touch`, etc.

- **docs/**
  - `RESEARCH_FILESYSTEM.docx` — A text file answering research questions about Java file handling (how to create files/folders, check if they exist, etc.)

- **README.md**
  - This file. Gives an overview, setup instructions, and usage examples.
