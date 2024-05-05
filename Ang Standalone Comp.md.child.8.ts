#set( $Plural = "${NAME}s" )
#set( $Entity = "${NAME}" )


import {Component, OnInit} from '@angular/core';
import {HttpClientModule} from "@angular/common/http";
import {${Entity}Service} from "./${Name}.service";
import {${Entity}Manager} from "./${Name}.manager";
import {${Entity}Model} from "./${Name}.model";
import {AsyncPipe, CommonModule, JsonPipe} from "@angular/common";
import {TableModule} from "primeng/table";
import {ButtonModule} from "primeng/button";
import {DialogService} from "primeng/dynamicdialog";
import {${Entity}FormComponent} from "./${Name}-form/${Name}-form.component";
import {ConfirmDialogModule} from "primeng/confirmdialog";
import {ConfirmationService, MessageService} from "primeng/api";
import {ToastModule} from "primeng/toast";

interface Column {
  field: string,
  header: string,
  type: CellType,
}

enum CellType {
  TEXT,
  DATE
}

@Component({
  selector: 'app-${Name}',
  standalone: true,
  imports: [
    HttpClientModule,
    AsyncPipe,
    JsonPipe,
    TableModule,
    CommonModule,
    ButtonModule,
    ${Entity}FormComponent,
    ConfirmDialogModule,
    ToastModule
  ],
  providers: [
    ${Entity}Service,
    DialogService,
    ConfirmationService,
    MessageService
  ],
  templateUrl: './${Name}.component.html',
  styleUrl: './${Name}.component.css'
})
export class ${Entity}Component implements OnInit{

  protected readonly CellType = CellType;

  all$ = this.${Name}Manager.all$;
  current$ = this.${Name}Manager.current$;
  
  cols! : Column[];

  constructor(private ${Name}Manager: ${Entity}Manager,
              private confirmationService: ConfirmationService,
              private messageService: MessageService,
              private dialogService: DialogService) {
  }

  ngOnInit(): void {
    this.${Name}Manager.getAll();
    
   this.cols = [
      {
        field: 'id',
        header: 'ID',
        type: CellType.TEXT
      },
      {
        field: 'name',
        header: 'NAME',
        type: CellType.TEXT
      },
      {
        field: 'creationDate',
        header: 'CREATE DATE',
        type: CellType.DATE
      },
      {
        field: 'modificationDate',
        header: 'Modification DATE',
        type: CellType.DATE
      }
    ];
  }
  
  edit(rowData: ${Entity}Model) {
    console.log('Edit ' + rowData.id);
    this.dialogService.open(${Entity}FormComponent, {
      header: 'Edit ${Entity}',
      width: '30vw',
      data: rowData
    });
  }

  confirmedDelete(rowData: ${Entity}Model) {
    console.log('Delete ' + rowData.id);
    this.confirmationService.confirm({
      message: 'Please confirm to proceed moving forward.',
      icon: 'pi pi-exclamation-circle',
      acceptIcon: 'pi pi-check mr-1',
      rejectIcon: 'pi pi-times mr-1',
      rejectButtonStyleClass: 'p-button-danger p-button-sm',
      acceptButtonStyleClass: 'p-button-outlined p-button-sm',
      accept: () => {
        this.${Name}Manager.delete(rowData.id!);
        this.messageService.add({ severity: 'info', summary: 'Confirmed', detail: 'Deleted ${Entity} id = ' + rowData.id, life: 3000 });
      },
      reject: () => {
        this.messageService.add({ severity: 'error', summary: 'Rejected', detail: 'You have rejected', life: 3000 });
      }
    });
  }
  
  createNew() {
    console.log('New ${Entity}');
    this.dialogService.open(${Entity}FormComponent, {
      header: 'New ${Entity}',
      width: '30vw'
    });
  }
  
  view(rowData: ${Entity}Model) {
    console.log('View ' + rowData.id);
    this.${Name}Manager.getById(rowData.id!);
    this.messageService.add({
      severity: 'info',
      summary: 'GetById',
      detail: 'Get ${Entity} id = ' + rowData.id,
      life: 3000
    });
  }

}

