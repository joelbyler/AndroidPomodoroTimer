class MainScreen
  include Gametel

  text(:view_info, :id => 'view_info')
  text(:expire_time, :id => 'expire_time')
  button(:start_button, :text => 'Start')  

end