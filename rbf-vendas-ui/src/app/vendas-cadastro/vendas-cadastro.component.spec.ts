import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VendasCadastroComponent } from './vendas-cadastro.component';

describe('VendasCadastroComponent', () => {
  let component: VendasCadastroComponent;
  let fixture: ComponentFixture<VendasCadastroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VendasCadastroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VendasCadastroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
