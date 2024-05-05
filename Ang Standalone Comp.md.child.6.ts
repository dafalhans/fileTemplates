#set( $Plural = "${NAME}s" )
#set( $Entity = "${NAME}" )

import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {${Entity}Model} from "./${Name}.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ${Entity}Service {

  private baseURI = '/api/${Plural}'

  constructor(private http: HttpClient) { }

  getAll(): Observable<${Entity}Model[]> {
    return this.http.get<${Entity}Model[]>(this.baseURI);
  }
  
  getById(id: string): Observable<${Entity}Model> {
    return this.http.get<${Entity}Model>(this.baseURI+ '/' + id);
  }
  
  create(model: ${Entity}Model): Observable<${Entity}Model> {
    return this.http.post<${Entity}Model>(this.baseURI, model);
  }

  update(model: ${Entity}Model): Observable<${Entity}Model> {
    return this.http.put<${Entity}Model>(this.baseURI, model);
  }
  
  delete(id: string): Observable<void> {
    return this.http.delete<void>(this.baseURI + '/' + id);
  }
}
