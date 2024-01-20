import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {${Entity}Manager} from "../${Name}.manager";
import {${Entity}Model} from "../${Name}.model";
import {JsonPipe} from "@angular/common";
import {InputTextModule} from "primeng/inputtext";
import {ButtonModule} from "primeng/button";
import {CardModule} from "primeng/card";
import {DynamicDialogConfig, DynamicDialogRef} from "primeng/dynamicdialog";
import {CalendarModule} from "primeng/calendar";
import {RippleModule} from "primeng/ripple";

@Component({
  selector: 'app-${Name}-form',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    InputTextModule,
    ButtonModule,
    CardModule,
    JsonPipe,
    CalendarModule,
    RippleModule
  ],
  templateUrl: './${Name}-form.component.html',
  styleUrl: './${Name}-form.component.css'
})
export class ${Entity}FormComponent implements OnInit{

  public readonly ${Entity}Fields = ${Entity}Fields;

  ${Name}Form!: FormGroup<${Entity}FormType>;

  constructor(private fb: FormBuilder,
              private dialogRef: DynamicDialogRef,
              protected config: DynamicDialogConfig,
              private ${Name}Manager: ${Entity}Manager) {
  }

  ngOnInit(): void {
    this.${Name}Form = this.fb.group<${Entity}FormType>(<${Entity}FormType>{
      [${Entity}Fields.Id]: this.fb.control({value:'', disabled:!!this.config.data}, Validators.required),
      [${Entity}Fields.Name]: this.fb.control(''),
    });

    this.${Name}Form.patchValue(this.config.data);
  }
  
  save() {
    console.log(this.${Name}Form.getRawValue())
    let model: ${Entity}Model = this.${Name}Form.getRawValue();
    if(this.config.data){
      this.${Name}Manager.update(model);
    }else{
      this.${Name}Manager.create(model);
    }
    this.dialogRef.close();
  }

}

enum ${Entity}Fields {
  Id = 'id',
  Name = 'name',
}

interface ${Entity}FormType {
  [${Entity}Fields.Id]: FormControl<string|null>;
  [${Entity}Fields.Name]: FormControl<string|null>;
}

