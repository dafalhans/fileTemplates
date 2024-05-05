#set( $Plural = "${NAME}s" )
#set( $Entity = "${NAME}" )

import {Injectable} from '@angular/core';
import {${Entity}Service} from "./${Name}.service";
import {BehaviorSubject} from "rxjs";
import {${Entity}Model} from "./${Name}.model";

@Injectable({
  providedIn: 'root'
})
export class ${Entity}Manager {

  all$ = new BehaviorSubject<${Entity}Model[]>([]);
  current$ = new BehaviorSubject<${Entity}Model|null>(null);

  constructor(private ${Name}Service: ${Entity}Service) { }

  getAll() {
    this.${Name}Service.getAll()
      .subscribe((data: ${Entity}Model[]) => this.all$.next(data));
  }
  
  getById(id: string) {
    this.${Name}Service.getById(id).subscribe((data) => this.current$.next(data));
  }
  
  create(model: ${Entity}Model) {
    this.${Name}Service.create(model).subscribe(() => this.getAll());
  }

  update(model: ${Entity}Model) {
    this.${Name}Service.update(model).subscribe(() => this.getAll());
  }
  
  delete(id: string) {
    this.${Name}Service.delete(id).subscribe(() => this.getAll());
  }

}
