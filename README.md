# LecxeojoP
POJO-Excel bidirectional mapper

## Manifesto
* easy to use / learn
* data oriented
* well tested
* well documented
* minimal number of dependencies
* thread safe

## Assumptions
* low level access to Excel via Apache POI
* annotation driven config
* annotations should reminescent some well known APIs like Jackson, Gson, JAXB in order to make it easier to learn
* supports Spring but can be used outside it
* different strategies to locate data (e.g. fixed coordinates, left-to-label, below-label)
* different strategies for data parsing (strict, smart guess)
* detailed error reporting (what&where e.g. Invalid format at cell A5)
* support for excel file verification (custom property)
* support for structured data (not only flat POJOs)
* can create new XLSX file or update existing one (template file)
* supports XLSX format only
* reads from
    * file system
    * class path
    * stream
    * zip file
    * web resource
* writes to:
    *  file system
    *  stream

## Dependencies
* Apache POI
* Spring
* Java 8

## Test dependencies
* JUnit 4
* AssertJ

## Code policies
* Google coding standards
* Checkstyle
* PMD
* Jacoco > 80% line coverage