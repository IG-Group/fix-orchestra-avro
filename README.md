# Repository To Avro Tools 

![](FIXorchestraLogo.png)

The repository contains utilities for integration of FIX Orchestra and Apache Avro.

* FIX Orchestra is intended to provide a standard and some reference implementation for machine readable rules of engagement between counterparties. A customisation of the FIX Orchestra specification for a specific Rules of Engagement is know as an "orchestration".

* [Apache Avro™](https://avro.apache.org/docs/current/index.html) is a data serialization system. One the features it provides is a binary data format that is widely used in [Apache Kafka](https://kafka.apache.org/) integrations. Avro can similarly be used in JMS implementations and other cases. Avro data serialization uses Avro schemas defined in JSON. 

Since FIX version 5.0 there has been a logical distinction between the FIX transport and the Application messages. FIX messages can be exchanged using diverse transports. The generation of Avro Schemas from a FIX Orchestra repository supports cases where Avro is useful or mandated.

## Modules

### repository-to-avro

Generates an Avro schema corresponding to the supplied FIX Orchestra repository.

### repository-to-avro-maven-plugin

Faciliates FIX Orchestra repository to Avro Schema generation in [Apache Maven](https://maven.apache.org/) projects.
