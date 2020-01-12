import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MamathaComponent } from './mamatha.component';

describe('MamathaComponent', () => {
  let component: MamathaComponent;
  let fixture: ComponentFixture<MamathaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MamathaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MamathaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
