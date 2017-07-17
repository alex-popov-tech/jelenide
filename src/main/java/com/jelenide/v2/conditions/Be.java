package com.jelenide.v2.conditions;

import com.jelenide.v2.jelements.AbstractJelement;
import com.jelenide.v2.jelements.Jelement;
import org.openqa.selenium.WebDriverException;

/**
 * Created by Alex on 7/17/2017.
 */
public class Be {

  public static JelementCondition visible() {
    return new JelementCondition() {
      @Override
      public Jelement apply(Jelement jelement) {
        try {
          return jelement.toWebElement().isDisplayed() ? jelement : null;
        } catch (WebDriverException e) {
          return null;
        }
      }
    };
  }

  public static JelementCondition hidden() {
    return new JelementCondition() {
      @Override
      public Jelement apply(Jelement jelement) {
        try {
          return !jelement.toWebElement().isDisplayed() ? jelement : null;
        } catch (WebDriverException e) {
          return null;
        }
      }
    };
  }

}