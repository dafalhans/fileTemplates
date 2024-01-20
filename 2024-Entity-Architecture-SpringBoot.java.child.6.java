#set($folder = "")
#set($foreach = "")
#set($rootRelativePath = "")
#set($endRootPath = "..")
#foreach ($folder in ${StringUtils.split(${PACKAGE_NAME},".")})
    $folder
    $rootRelativePath
    #set($rootRelativePath = "$!rootRelativePath../")
    $rootRelativePath
    #if ($foreach.hasNext == false)
        #set($rootRelativePath = "$!rootRelativePath$endRootPath")
    #end
#end
$rootRelativePath

public class TestClass {

    private String id;
    private String creationDate;
    
    // ${postgrestemplate}
}


    
    

