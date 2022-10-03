# Another basic jsonnet file with multiple objects.
# Author: Andrew Jarombek
# Date: 10/3/2022

local Airport(name, symbol) = {
    name: name,
    symbol: symbol
};

{
    jfk: Airport("John F. Kennedy International Airport", "JFK"),
    atl: Airport("Hartsfield-Jackson Atlanta International Airport", "ATL")
}