package fisk.chipcloud;

import android.graphics.PorterDuff;
import android.support.annotation.NonNull;

import static fisk.chipcloud.ChipCloudConfig.UNSPECIFIED;

class ConfigHelper {

  static void initialise(ToggleChip toggleChip, @NonNull ChipCloudConfig config){
    setUncheckedColors(toggleChip, config);
    if(config.typeface != null){
      toggleChip.setTypeface(config.typeface);
    }
  }

  static void update(ToggleChip toggleChip, @NonNull ChipCloudConfig config){
    if(toggleChip.isChecked()){
      setCheckedColors(toggleChip, config);
    }else{
      setUncheckedColors(toggleChip, config);
    }
  }

  static private void setUncheckedColors(ToggleChip toggleChip, @NonNull ChipCloudConfig config){
    if(config.uncheckedChipColor != UNSPECIFIED){
      toggleChip.getBackground().setColorFilter(config.uncheckedChipColor, PorterDuff.Mode.SRC);
    }
    if(config.uncheckedTextColor != UNSPECIFIED) {
      toggleChip.setTextColor(config.uncheckedTextColor);
    }
  }

  static private void setCheckedColors(ToggleChip toggleChip, @NonNull ChipCloudConfig config){
    if(config.checkedChipColor != UNSPECIFIED){
      toggleChip.getBackground().setColorFilter(config.checkedChipColor, PorterDuff.Mode.SRC);
    }
    if(config.checkedTextColor != UNSPECIFIED){
      toggleChip.setTextColor(config.checkedTextColor);
    }
  }
}
