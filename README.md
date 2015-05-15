# stitchcounter-clj

Command line tool to help you with knitting and crocheting.

It is a porting in Clojure of the same program I wrote in C: [stitchcounter.c](https://github.com/manuel-uberti/c-bag/blob/master/stitchcounter.c)

I created the executable using [lein-bin](https://github.com/Raynes/lein-bin).

## Prerequisites
This tool needs the Java Runtime Environment to run. Download and install the correct JRE for your OS.

Check everything is working with the command:
```console
$ java -version
```
For instance, this is the output on my machine:
```console
$ java -version
openjdk version "1.8.0_45-internal"
OpenJDK Runtime Environment (build 1.8.0_45-internal-b14)
OpenJDK Server VM (build 25.45-b02, mixed mode)
```

## Usage
Clone this repo:
```console
$ git clone https://github.com/manuel-uberti/stitchcounter-clj.git
```
Run ```stitch-counter``` from the command line:
```console
$ cd stitchcounter-clj
$ ./stitch-counter
```
You will be presented with the following prompt:
```console
$./stitch-counter
Stitchcounter: useful tool to help knitting and crocheting
Options:
    1 Calculate stitches from original gauge
    2 Calculate stitches from dimensions
    3 Quit
Pick your option:
```
Pick your option and follow the instructions.

## License

Copyright © 2015 Manuel Uberti

Distributed under the Eclipse Public License.
