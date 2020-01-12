import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { JyothiComponent } from './jyothi.component';

describe('JyothiComponent', () => {
  let component: JyothiComponent;
  let fixture: ComponentFixture<JyothiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ JyothiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(JyothiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
