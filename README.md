C:\Users\hansv\AppData\Roaming\JetBrains\IntelliJIdea2023.3\fileTemplates

```
C:\Users\hansv\AppData\Roaming\JetBrains\IntelliJIdea2023.3\fileTemplates>dir
 Volume in drive C has no label.
 Volume Serial Number is 8EBC-AF63

 Directory of C:\Users\hansv\AppData\Roaming\JetBrains\IntelliJIdea2023.3\fileTemplates

20/01/2024  22:54    <DIR>          .
20/01/2024  22:28    <DIR>          ..
20/01/2024  17:29               669 2024-Base-Architecture-SpringBoot.java
20/01/2024  17:31               181 2024-Base-Architecture-SpringBoot.java.child.0.java
20/01/2024  18:12               371 2024-Base-Architecture-SpringBoot.java.child.1.java
20/01/2024  17:43             2.244 2024-Base-Architecture-SpringBoot.java.child.2.java
20/01/2024  17:42               777 2024-Entity-Architecture-SpringBoot.java
20/01/2024  19:41             2.220 2024-Entity-Architecture-SpringBoot.java.child.0.java
20/01/2024  17:54               348 2024-Entity-Architecture-SpringBoot.java.child.1.java
20/01/2024  17:56               201 2024-Entity-Architecture-SpringBoot.java.child.2.java
20/01/2024  18:52             2.183 2024-Entity-Architecture-SpringBoot.java.child.3.java
20/01/2024  19:37             1.459 2024-Entity-Architecture-SpringBoot.java.child.4.java
20/01/2024  19:41             1.131 2024-Entity-Architecture-SpringBoot.java.child.5.java
20/01/2024  14:45               380 BaseArchitecture.java
24/10/2023  19:12               357 BaseArchitecture.java.child.0.java
24/10/2023  19:12               181 BaseArchitecture.java.child.1.java
02/11/2023  12:15             1.432 EntityArchitecture.java
24/10/2023  19:14               163 EntityArchitecture.java.child.0.java
24/10/2023  19:15             1.125 EntityArchitecture.java.child.1.java
24/10/2023  19:15               175 EntityArchitecture.java.child.2.java
24/10/2023  19:16               323 EntityArchitecture.java.child.3.java
24/10/2023  19:16             1.204 EntityArchitecture.java.child.4.java
24/10/2023  19:17               664 EntityArchitecture.java.child.5.java
20/01/2024  14:40    <DIR>          includes
24/10/2023  20:00               619 Java-IMapper.java
24/10/2023  19:59             1.454 Java-Mapper-embedded-entity.java
```


C:\Users\hansv\AppData\Roaming\JetBrains\IntelliJIdea2023.3\options\file.template.settings.xml

```
<application>
  <component name="ExportableFileTemplateSettings">
    <includes_templates>
      <template name="Hans Header.java" file-name="Hans Header.java" reformat="true" live-template-enabled="false" />
    </includes_templates>
    <default_templates>
      <template name="2024-Base-Architecture-SpringBoot.java" file-name="base/business/BaseEntity.java" reformat="true" live-template-enabled="false">
        <template name="2024-Base-Architecture-SpringBoot.java.child.2.java" file-name="base/util/SoutLogger.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Base-Architecture-SpringBoot.java.child.1.java" file-name="base/service/mapper/IMapper.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Base-Architecture-SpringBoot.java.child.0.java" file-name="base/service/dto/Base.java" reformat="true" live-template-enabled="false" />
      </template>
      <template name="2024-Base-Architecture-SpringBoot.java.child.0.java" file-name="base/service/dto/Base.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Base-Architecture-SpringBoot.java.child.1.java" file-name="base/service/mapper/IMapper.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Base-Architecture-SpringBoot.java.child.2.java" file-name="base/util/SoutLogger.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Entity-Architecture-SpringBoot.java" file-name="business/${NAME}Entity.java" reformat="true" live-template-enabled="false">
        <template name="2024-Entity-Architecture-SpringBoot.java.child.5.java" file-name="service/mapper/impl/${NAME}Mapper.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Entity-Architecture-SpringBoot.java.child.4.java" file-name="service/service/${NAME}Service.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Entity-Architecture-SpringBoot.java.child.3.java" file-name="Test_${NAME}_Application.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Entity-Architecture-SpringBoot.java.child.2.java" file-name="service/dto/${NAME}.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Entity-Architecture-SpringBoot.java.child.1.java" file-name="business/repository/impl/${NAME}Repository.java" reformat="true" live-template-enabled="false" />
        <template name="2024-Entity-Architecture-SpringBoot.java.child.0.java" file-name="web/rest/${NAME}Resource.java" reformat="true" live-template-enabled="false" />
      </template>
      <template name="2024-Entity-Architecture-SpringBoot.java.child.0.java" file-name="web/rest/${NAME}Resource.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Entity-Architecture-SpringBoot.java.child.1.java" file-name="business/repository/impl/${NAME}Repository.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Entity-Architecture-SpringBoot.java.child.2.java" file-name="service/dto/${NAME}.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Entity-Architecture-SpringBoot.java.child.3.java" file-name="Test_${NAME}_Application.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Entity-Architecture-SpringBoot.java.child.4.java" file-name="service/service/${NAME}Service.java" reformat="true" live-template-enabled="false" />
      <template name="2024-Entity-Architecture-SpringBoot.java.child.5.java" file-name="service/mapper/impl/${NAME}Mapper.java" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md" file-name="/$NAME/${NAME}.component.README" reformat="true" live-template-enabled="false">
        <template name="Ang Standalone Comp.md.child.0.html" file-name="/${NAME}/${NAME}.component" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.1.css" file-name="/${NAME}/${NAME}.component" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.2.css" file-name="/${NAME}/${NAME}-form/${NAME}-form.component" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.3.html" file-name="/${NAME}/${NAME}-form/${NAME}-form.component" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.4.ts" file-name="/${NAME}/${NAME}-form/${NAME}-form.component" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.5.ts" file-name="/${NAME}/${NAME}.manager" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.6.ts" file-name="/${NAME}/${NAME}.service" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.7.ts" file-name="/${NAME}/${NAME}.model" reformat="true" live-template-enabled="false" />
        <template name="Ang Standalone Comp.md.child.8.ts" file-name="/${NAME}/${NAME}.component" reformat="true" live-template-enabled="false" />
      </template>
      <template name="Ang Standalone Comp.md.child.0.html" file-name="/${NAME}/${NAME}.component" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.1.css" file-name="/${NAME}/${NAME}.component" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.2.css" file-name="/${NAME}/${NAME}-form/${NAME}-form.component" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.3.html" file-name="/${NAME}/${NAME}-form/${NAME}-form.component" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.4.ts" file-name="/${NAME}/${NAME}-form/${NAME}-form.component" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.5.ts" file-name="/${NAME}/${NAME}.manager" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.6.ts" file-name="/${NAME}/${NAME}.service" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.7.ts" file-name="/${NAME}/${NAME}.model" reformat="true" live-template-enabled="false" />
      <template name="Ang Standalone Comp.md.child.8.ts" file-name="/${NAME}/${NAME}.component" reformat="true" live-template-enabled="false" />
      <template name="proxy.conf.json" file-name="proxy.conf.json" reformat="true" live-template-enabled="false" />
    </default_templates>
  </component>
</application>
```
