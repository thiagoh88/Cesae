const toastTrigger = document.getElementById('liveToastBtn')
const toastLiveExample = document.getElementById('liveToast')
const toastTrigger1 = document.getElementById('liveToastBtn1')
const toastLiveExample1 = document.getElementById('liveToast1')
const toastTrigger2 = document.getElementById('liveToastBtn2')
const toastLiveExample2 = document.getElementById('liveToast2')


if (toastTrigger) {
  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
  toastTrigger.addEventListener('click', () => {
    toastBootstrap.show()
  })
}

if (toastTrigger1) {
  const toastBootstrap1 = bootstrap.Toast.getOrCreateInstance(toastLiveExample1)
  toastTrigger1.addEventListener('click', () => {
    toastBootstrap1.show()
  })
}

if (toastTrigger2) {
  const toastBootstrap2 = bootstrap.Toast.getOrCreateInstance(toastLiveExample2)
  toastTrigger2.addEventListener('click', () => {
    toastBootstrap2.show()
  })
}