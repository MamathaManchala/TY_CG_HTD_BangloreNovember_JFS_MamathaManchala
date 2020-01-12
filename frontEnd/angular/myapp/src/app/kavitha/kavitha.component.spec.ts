import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KavithaComponent } from './kavitha.component';

describe('KavithaComponent', () => {
  let component: KavithaComponent;
  let fixture: ComponentFixture<KavithaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KavithaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KavithaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
