# meta-motorknob

Very simple yocto layer.  
Provides [MotorKnob-Driver](https://github.com/Lukas-Sturm/MotorKnob-Driver) as a recipe.  

## Usage

> MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "kernel-module-motorknob-driver"
> KERNEL_MODULE_AUTOLOAD += "motorknob-driver"

## Dependencies

Needs as i2c enabled Linux.  