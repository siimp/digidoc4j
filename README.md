# DigiDoc4j
DigiDoc4j is a Java library for digitally signing documents and creating digital signature containers of signed documents.

# Features
* Creating BDOC and DDOC containers
* Digitally signing containers in XAdES format
* Validating BDOC and DDOC containers

# How to use it
* Take a look at the [examples](https://github.com/open-eid/digidoc4j/wiki/Examples-of-using-it)
* See the full [DigiDoc4j API](http://open-eid.github.io/digidoc4j/) description
* Explore the [Wiki](https://github.com/open-eid/digidoc4j/wiki) section
* Download the latest [release](https://github.com/open-eid/digidoc4j/releases)
* See [library development guide](https://github.com/open-eid/digidoc4j/wiki/Development)

# BDOC container format
* Has **.bdoc** extension
* BDOC is a new digital signature format developed in 2014 to replace the old, DDOC (DigiDoc) digital signature format. 
* The benefits of the new format include the higher security level, the long-term integrity of the signed documents, as well as the better compliance with international standards.
* Supports two signature formats: **BDOC-TM** and **BDOC-TS**
* **BDOC-TM** signature format with a **time-mark** ensuring long-term proofability of the authenticity of the signature. This format has been used as a default digital signature format in Estonia since 2015. It is based on ASiC-E LT-TM signature format.
* **BDOC-TS** signature format with a **time-stamp**. In contrast to the BDOC-TM format, long-term proofability of the authenticity of the signature is ensured by time-stamps. It is based on the ASiC-E LT signature format which is highly compliant with the international standards.
* To ensure better compliance with international standards, it's recommended to sign documents with the **BDOC-TS time-stamp** signature profile.
* Signatures are stored in **XAdES** format.
* A **.bdoc** file is in fact a ZIP container with the signed files, the signatures and the protocol control information and can basically be opened by any program that recognizes the ZIP format.
* See the [BDOC 2.1.2 specification](http://id.ee/public/bdoc-spec212-eng.pdf)
* See more information about [digital signature formats](http://www.id.ee/index.php?id=36108)

# DDOC container format
* Has **.ddoc** extension
* An old DigiDoc digital signature format
* Since year 2015 it's recommended not to sign documents in the DDOC format
* It is based on XML Advanced Electronic Signatures (**XAdES**) format, corresponding to  profile XAdES-X-L
* The DigiDoc container includes the source files (the files that were signed) as well as the signatures that are related to the signed file(s)
* Every signature contains the certificate, validity confirmation and the validity confirmation service certificate.
* See the [DigiDoc format description](http://www.id.ee/public/DigiDoc_format_1.3.pdf)

# Requirements
* Java 1.7
* Internet access to external verification services
 * OCSP (Online Certificate Status Protocol) - http://ocsp.sk.ee
 * EU TSL (European Commission's Trusted Status List) - https://ec.europa.eu/information_society/policy/esignature/trusted-list/tl-mp.xml
 * TSA (Time Stamping Authority) - http://tsa.sk.ee

# Licence
* LGPL (GNU Library General Public License, see LICENSE.LGPL)
* © Estonian Information System Authority

## Support
Official builds are provided through official distribution point [installer.id.ee](https://installer.id.ee). If you want support, you need to be using official builds. Contact for assistance by email [abi@id.ee](mailto:abi@id.ee) or [www.id.ee](http://www.id.ee).

Source code is provided on "as is" terms with no warranty (see license for more information). Do not file Github issues with generic support requests.
