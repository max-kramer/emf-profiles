package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Image;

@SuppressWarnings("all")
public class WrappingLabelEx extends WrappingLabel {
  public WrappingLabelEx(final String string, final Image image) {
    super(string, image);
  }
  
  public WrappingLabelEx(final String string) {
    super(string);
  }
  
  public int getIconTextGap() {
    return 0;
  }
}
