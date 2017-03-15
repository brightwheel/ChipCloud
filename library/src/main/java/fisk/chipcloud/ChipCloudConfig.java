package fisk.chipcloud;

import android.graphics.Typeface;
import android.support.annotation.ColorInt;

public class ChipCloudConfig {

  public final static int UNSPECIFIED = -1;
  public Typeface typeface = null;
  public @ColorInt int checkedChipColor = UNSPECIFIED;
  public @ColorInt int uncheckedChipColor = UNSPECIFIED;
  public @ColorInt int checkedTextColor = UNSPECIFIED;
  public @ColorInt int uncheckedTextColor = UNSPECIFIED;
  public ChipCloud.SelectMode selectMode = ChipCloud.SelectMode.multi;
  public boolean useInsetPadding = false;

  public ChipCloudConfig(){
  }

  public ChipCloudConfig typeface(Typeface typeface){
    this.typeface = typeface;
    return this;
  }

  public ChipCloudConfig checkedChipColor(@ColorInt int checkedChipColor){
    this.checkedChipColor = checkedChipColor;
    return this;
  }

  public ChipCloudConfig uncheckedChipColor(@ColorInt int uncheckedChipColor){
    this.uncheckedChipColor = uncheckedChipColor;
    return this;
  }

  public ChipCloudConfig checkedTextColor(@ColorInt int checkedTextColor){
    this.checkedTextColor = checkedTextColor;
    return this;
  }

  public ChipCloudConfig uncheckedTextColor(@ColorInt int uncheckedTextColor){
    this.uncheckedTextColor = uncheckedTextColor;
    return this;
  }

  public ChipCloudConfig selectMode(ChipCloud.SelectMode selectMode){
    this.selectMode = selectMode;
    return this;
  }

  public ChipCloudConfig useInsetPadding(boolean useInsetPadding){
    this.useInsetPadding = useInsetPadding;
    return this;
  }
}
