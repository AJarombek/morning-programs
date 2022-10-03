# Basic jsonnet file.
# Author: Andrew Jarombek
# Date: 10/3/2022

{
    first: "Andrew",
    last: "Jarombek",
    full_name: self.first + " " + self.last
}