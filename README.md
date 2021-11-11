# WildLife Tracker Java App :tiger2

## Author
Edward Gero

## Description
 
wildlife tracker is a web app for tracking animal in a park and ensuring their safety while considering the new construction program around the park. It is mainly for protecting animals endangered by the construction. 

### Prerequisites
* An up-to-date browser, preferably chrome or mozilla
* Internet connection !

## Behaviour Driven Development(BDD)
|Behaviour 	           |    Input 	                 |       Output          |
|----------------------------------------------|:-----------------------------------:|-----------------------------:|       
|Page loads.                         |   User goes to add animal, add animal in a form.              |Once the user submits the form, it redirects them to anoter page where data is added    |                       |

## Technologies Used

* Java
* Spark
* Handlebars
* CSS 3

### Installation guide :notebook:
If you want to use this as your template, here's how to go about it:

* Install Git on you machine
* Maneouver to 'clone or download' button and get the link
* --Linux Users-- open your terminal and run the 'git clone ...' command in a directory of your choice
* --for Windows Users-- Navigate to the location you'd want the repository located, right click and select "git bash here"
* Clone the repository
* Upon completion, navigate to the cloned repository
  Feel free to edit the files to your prefered taste
* Now build the Database to enable storing of created instances
  * Install Postgres SQL
  * run the following commands in your terminal

CREATE DATABASE wildlife;

        CREATE TABLE animals (id serial PRIMARY KEY, name varchar,ranger varchar, age varchar, location varchar, health varchar, status varchar, spotted timestamp);

        CREATE TABLE sighting (id serial PRIMARY KEY, location varchar);

        CREATE DATABASE wildlife_test WITH TEMPLATE wildlife;

### BUGS
NO BUGS noted, If any are experienced contact via Email  gero.temitayo33@gmail.com :mailbox: and the issue will be sorted.

## Contact Information
* Email- gero.temitayo33@gmail.com
* Mobile Number- +07122222222


## License
Licenced by

MIT License

Copyright (c) [2021] [edward gero]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.