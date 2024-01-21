# Pumpkin Growth Simulation

This Java repository, collaboratively developed by Yarin Ackerman and Rami Abu Rabia, simulates the growth of pumpkins in a concurrent environment.

## Table of Contents
- [High (ass1_pumpkin)](#high-ass1_pumpkin)
  - [Overview](#overview)
  - [Classes](#classes)
  - [Usage](#usage)
  - [License](#license)
  - [Authors](#authors)
  
- [MyThread (ass1_pumpkin)](#mythread-ass1_pumpkin)
  - [Overview](#overview-1)
  - [Classes](#classes-1)
  - [Usage](#usage-1)
  - [License](#license-1)
  - [Authors](#authors-1)

- [PumpComp (ass1_pumpkin)](#pumpcomp-ass1_pumpkin)
  - [Overview](#overview-2)
  - [Usage](#usage-2)
  - [License](#license-2)
  - [Authors](#authors-2)

- [Pumpkin (ass1_pumpkin)](#pumpkin-ass1_pumpkin)
  - [Overview](#overview-3)
  - [Usage](#usage-3)
  - [License](#license-3)
  - [Authors](#authors-3)

## High (ass1_pumpkin)
### Overview
The `High` class represents the height criteria for pumpkins in a growth competition. It keeps track of the maximum height and assigns ranks to pumpkins based on their growth.

### Classes
- `High`: Manages the maximum height criteria and assigns ranks to pumpkins.

### Usage
Create an instance of `High` and pass it to each `Pumpkin` instance. Run multiple `MyThread` instances to simulate pumpkin growth concurrently. The `High` class will declare winners and assign finishing positions.

### License
This code is released under the MIT License. Refer to the [LICENSE](ass1_pumpkin/LICENSE) file for details.

### Authors
- Yarin Ackerman
- Rami Abu Rabia

## MyThread (ass1_pumpkin)
### Overview
The `MyThread` class implements the `Runnable` interface to simulate the growth of a pumpkin in a separate thread. It periodically calls the `grow` method of the associated `Pumpkin` instance.

### Classes
- `MyThread`: Simulates the growth of a pumpkin in a separate thread.

### Usage
Create an instance of `MyThread` and pass it a `Pumpkin` instance. Start the thread to simulate pumpkin growth concurrently.

### License
This code is released under the MIT License. Refer to the [LICENSE](ass1_pumpkin/LICENSE) file for details.

### Authors
- Yarin Ackerman
- Rami Abu Rabia

## PumpComp (ass1_pumpkin)
### Overview
The `PumpComp` class serves as the entry point for the pumpkin growth simulation. It takes user input for the maximum pumpkin height and initiates the simulation for multiple pumpkins using threads.

### Usage
Run the `PumpComp` class to initiate the pumpkin growth simulation. Input the maximum pumpkin height when prompted.

### License
This code is released under the MIT License. Refer to the [LICENSE](ass1_pumpkin/LICENSE) file for details.

### Authors
- Yarin Ackerman
- Rami Abu Rabia

## Pumpkin (ass1_pumpkin)
### Overview
The `Pumpkin` class represents an individual pumpkin in the growth competition. It includes methods for simulating pumpkin growth and interacts with the `High` class to determine the winner and finishing positions.

### Classes
- `Pumpkin`: Represents an individual pumpkin in the growth competition.

### Usage
Create instances of `Pumpkin` and pass them the `High` instance. Simulate pumpkin growth using multiple threads.

### License
This code is released under the MIT License. Refer to the [LICENSE](ass1_pumpkin/LICENSE) file for details.

### Authors
- Yarin Ackerman
- Rami Abu Rabia
