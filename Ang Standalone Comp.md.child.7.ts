#set( $Plural = "${NAME}s" )
#set( $Entity = "${NAME}" )


export class ${Entity}Model {
  id?: string | null;
  name?: string | null;
  creationDate?: Date | null;
  modificationDate?: Date | null;
}