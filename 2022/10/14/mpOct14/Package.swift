// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct14",
    products: [
        .library(
            name: "mpOct14",
            targets: ["mpOct14"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct14",
            dependencies: []),
        .testTarget(
            name: "mpOct14Tests",
            dependencies: ["mpOct14"]),
    ]
)
