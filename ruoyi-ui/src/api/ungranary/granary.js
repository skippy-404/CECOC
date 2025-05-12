import request from '@/utils/request'

// 查询granary列表
export function listGranary(query) {
  return request({
    url: '/ungranary/granary/list',
    method: 'get',
    params: query
  })
}

// 查询granary详细
export function getGranary(id) {
  return request({
    url: '/ungranary/granary/' + id,
    method: 'get'
  })
}

// 新增granary
export function addGranary(data) {
  return request({
    url: '/ungranary/granary',
    method: 'post',
    data: data
  })
}

// 修改granary
export function updateGranary(data) {
  return request({
    url: '/ungranary/granary',
    method: 'put',
    data: data
  })
}

// 删除granary
export function delGranary(id) {
  return request({
    url: '/ungranary/granary/' + id,
    method: 'delete'
  })
}
