def print_directory_contents(sPath):
    """
    This function takes the name of a directory
    and prints out the paths files within that
    directory as well as any files contained in
    contained directories.

    This function is similar to os.walk. Please don't
    use os.walk in your answer. We are interested in your
    ability to work with nested structures.

    Useful functions:
     - os.listdir(path) - returns a list of all files/directories of path
     - os.path.join(path, childPath) - concatenate one (or more) paths
     - os.path.isdir(path) - returns True if path refers to a directory

     :param sPath: full path to current directory (we know sPath is a directory and NOT a file)
     :type sPath: str
    """

    for file in os.listdir(sPath):
        if not os.path.isdir(file):
            print file
        else:
            print_directory_contents(os.path.join(sPath, file))



