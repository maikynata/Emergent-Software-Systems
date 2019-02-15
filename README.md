# SAGLSys Emergent Software System

**Proposal for the final project of the** ​ **Emergent Software Summer School: Building Systems that Self-Assemble and Self-Learn**

<p align="justify"> Satellite images uses a lot of memory space because of their high resolution. This makes it difficult for simultaneous access to different users because the amount of time to load them into a web page is costly. In addition, the distribution of resources to meet these requisition demands still presents deficiencies. Therefore, this project aims to perform the optimization of response time in systems that work with Geographic Image Systems (GIS) by implementing two adaptive modules in the **DANA Language**. 
The first one is responsible for performing the image processing, aiming to compress and treat a high resolution image in a distributed architecture so that it is made available in a timely manner to the user. The second module will be responsible for automatically and adaptively define the appropriate configuration according to the characteristics of the user request which is guided by a learning algorithm that simultaneously discover the optimal configuration using pre-defined metrics such as response time. Figure 1 presents an initial proposal of the general architecture for the Self-Adapted GIS Loader System (SAGLSys). </p>

Figure 1: General Architecture of the SAGLSys
Also the implementation of the SAGLSys and its modules will be performed by two
teams according to Table 1 below:

## Architecture
![alt tag](https://github.com/maikynata/Emergent-Software-Systems/raw/master/Automated-Configuration-Learning-Module/architecture/arch.png)


## Dependencies:
 - `Dana VPU [version 224] [released 11th January 2019] >= 2.7`

Download dana on http://www.projectdana.com/

## Running:
 1. Open 3 Terminals

 2. Terminal 1: Start EmergentSys
 ```
 Automated-Configuration-Learning-Module/pal$ dana -sp ../ws EmergentSys.o
 ```
 3. Terminal 2: Start Learner
 ```
 Automated-Configuration-Learning-Module/pal$ dana -sp ../ws Learner.o
 ```
 4. Terminal 3: Start ClientRequests
 ```
 Automated-Configuration-Learning-Module/Client$ dana ClientRequests.o
 ```
