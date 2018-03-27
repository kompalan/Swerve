# Swerve
New and Updated Code for the Robostangs Swerve Robot

# ChangeLog
## Link to All Deprecations
[Phoenix Framework Migration Guide](https://github.com/CrossTheRoadElec/Phoenix-Documentation/blob/master/Migration%20Guide.md)
## Refactored Code to Account for Deprecations
### Before
```{r}
this.turn.set(double p)
```
### After
```{r}
this.turn.set(ControlMode.PercentOutput, double p)
```
