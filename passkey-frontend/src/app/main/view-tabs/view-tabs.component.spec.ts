import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewTabsComponent } from './view-tabs.component';
import { provideHttpClient } from '@angular/common/http';

describe('ViewTabsComponent', () => {
  let component: ViewTabsComponent;
  let fixture: ComponentFixture<ViewTabsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ViewTabsComponent],
        providers: [provideHttpClient()]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewTabsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
