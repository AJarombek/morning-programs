// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct15",
    products: [
        .library(
            name: "mpOct15",
            targets: ["mpOct15"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct15",
            dependencies: []),
        .testTarget(
            name: "mpOct15Tests",
            dependencies: ["mpOct15"]),
    ]
)
