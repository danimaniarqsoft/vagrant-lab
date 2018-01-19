
`/etc/profile`

This sets up user environment information for every user. It is executed
when you first log in. This file provides values for your path, in addition
to setting environment variables for such things as the location of your
mailbox and the size of your history files. Finally, /etc/profile gathers
shell settings from configuration files in the /etc/profile.d directory.

`/etc/bashrc`

This executes for every user who runs the bash shell, each time a bash
shell is opened. It sets the default prompt and may add one or more
aliases. Values in this file can be overriden by information in each 
user's ~/.bashrc file.

`~/.bash_profile`

This is used by each user to enter information that is specific to his or
her use of the shell. It is executed only once, when the user logs in. By
default, it sets a few environment variables and executes the user’s
.bashrc file. This is a good place to add environment variables
because, once set, they are inherited by future shells.

`~/.bashrc`

This contains the information that is specific to you bash shells. It is
read when you log in and also each time you open a new bash shell.
This is the best location to add aliases so that your shell picks them up.

`~/.bash_logout`

This executes each time you log out (exit the last bash shell). By default,
it simply clears you screen.


**NOTE**: To jave the new information just added to the file available
from the current shell, type the following:

`source $HOME/.bashrc`
