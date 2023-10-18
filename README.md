# Digital Message Board
In diesem Projekt ging es mir primär darum, ein richtiges erreichbares Backend zu erstellen, was dann schließlich auch auf einem Server laufen kann (wie in diesem Fall dem Raspberry 3B+). Dabei nutze ich eine PostgreSQL Datenbank und das Spring Framework fürs Backend. Das Betriebssystem des Raspberry Pi 3B+ ist ein Ubuntu Server auf dem die Datenbank sowie das Backend (als .war) gehostet wird. Der Server läuft 24/7.

Die Seite lässt sich erreichen, indem man einfach die IP des Raspberry eingibt (oder den Hostnamen der sich im Imager festlegen lässt und normalerweise **raspberrypi.local** ist), da das der einzige Service ist, der auf dem Server läuft. Hier ein Demonstrationsvideo der Seite:

https://user-images.githubusercontent.com/92476790/185794208-8cc5873a-4c9c-469b-bf4e-4740f33def1d.mp4

## Setup🚀

Da das erstellen bzw. aufsetzen der des Backends sehr schwierig ist möchte ich hier auf zwei gute Artikel verweisen, in denen das Aufsetzen

- des Backends: https://medium.com/geekculture/turn-your-raspberry-pi-into-a-server-to-run-your-java-spring-mvc-app-862214279587

- und der DB: https://www.digitalocean.com/community/tutorials/how-to-install-postgresql-on-ubuntu-20-04-quickstart

ausführlich erklärt wird.
