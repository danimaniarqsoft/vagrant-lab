**<**

Directs the contents of a fi le to the command. In most cases, this is the default
action expected by the command and the use of the character is optional; using
less bigfile is the same as less < bigfile.

_Example:_
```
mail root < ~/.bashrc
```

**>**

Directs the standard output of a command to a file. If the file exists, the
content of that file is overwritten.

Example:
```
man chmod | col -b > /tmp/chmod
```

**2>**

Directs standard error (error messages) to the file.

**&>**

Directs both standard output and standard error to the file.

**>>**

Directs the output of a command to a fi le, adding the output to the end of the
existing file.

Example:

```
echo "I finished the project on $(date)" >> ~/projects
```
